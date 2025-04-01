package com.itheima.ui;

import com.itheima.bean.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class EmployeeManagementSystem extends JFrame{

    private JFrame frame;
    private JTextField searchField;
    private JButton searchButton;
    private JButton addButton;
    private JTable employeeTable;
    private DefaultTableModel tableModel;
    private JPopupMenu popupMenu;
    private JMenuItem editItem;
    private JMenuItem deleteItem;
    private String username;
    //准备一个静态集合对象,用于存储系统中的全部员工对象信息。
    private  ArrayList<Employee> employees=new ArrayList<>();

    public  EmployeeManagementSystem(String username) {
        super("欢迎"+username+"进入人事管理界面");
        this.username = username;
        initialize();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EmployeeManagementSystem();
        });
    }

    public EmployeeManagementSystem() {

    }

    private void initialize() {
        frame = new JFrame("员工信息管理系统");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 创建顶部面板
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        topPanel.setBackground(Color.WHITE);

        searchField = new JTextField(20);
        searchButton = new JButton("搜索");
        addButton = new JButton("添加");

        topPanel.add(searchField);
        topPanel.add(searchButton);
        topPanel.add(addButton);

        // 创建表格模型
        String[] columnNames = {"ID", "姓名","性别","年龄","电话", "职位","入职时间","薪水", "部门信息"};
        tableModel = new NonEditableTableModel(columnNames, 0);

        // 初始化表格数据
        for (int i = 1; i <= 20; i++) {
            tableModel.addRow(new Object[]{i, "员工" + i, "职位" + i, "部门" + i});
        }

        employeeTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(employeeTable);

        // 右键菜单
        popupMenu = new JPopupMenu();
        editItem = new JMenuItem("修改");
        deleteItem = new JMenuItem("删除");

        popupMenu.add(editItem);
        popupMenu.add(deleteItem);

        employeeTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int r = employeeTable.rowAtPoint(e.getPoint());
                if (r >= 0 && r < employeeTable.getRowCount()) {
                    employeeTable.setRowSelectionInterval(r, r);
                } else {
                    employeeTable.clearSelection();
                }

                if (e.isPopupTrigger()) {
                    popupMenu.show(employeeTable, e.getX(), e.getY());
                }
            }
        });

        // 搜索按钮事件监听器
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchEmployee();
            }
        });

        // 添加按钮事件监听器
        addButton.addActionListener( e-> addEmployee());


        // 修改按钮事件监听器
        editItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editEmployee();
            }
        });

        // 删除按钮事件监听器
        deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteEmployee();
            }
        });

        // 将组件添加到框架中
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void searchEmployee() {
        String searchText = searchField.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        employeeTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
    }

    private void addEmployee() {
        AddEmployeeDialog dialog = new AddEmployeeDialog(frame, tableModel);
        dialog.setVisible(true);
    }

    private void editEmployee() {
        int selectedRow = employeeTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(frame, "请选择要修改的员工", "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = (Integer) tableModel.getValueAt(selectedRow, 0); // 获取ID值
        EditEmployeeDialog dialog = new EditEmployeeDialog(frame, tableModel, selectedRow, id);
        dialog.setVisible(true);
    }

    private void deleteEmployee() {
        int selectedRow = employeeTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(frame, "请选择要删除的员工", "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(frame, "确定要删除此员工吗？", "确认删除", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            int id = (Integer) tableModel.getValueAt(selectedRow, 0); // 获取ID值
            tableModel.removeRow(selectedRow);
            JOptionPane.showMessageDialog(frame, "员工 ID: " + id + " 已删除", "删除成功", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // 自定义非可编辑表格模型
    private static class NonEditableTableModel extends DefaultTableModel {
        public NonEditableTableModel(Object[] columnNames, int rowCount) {
            super(columnNames, rowCount);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // 所有单元格都不可编辑
        }
    }

    // 添加员工对话框
    private static class AddEmployeeDialog extends JDialog {

        private JTextField nameField;
        private JTextField positionField;
        private JTextField departmentField;
        private JTextField idField;
        private JTextField ageField;
        private JTextField phoneField;
        private JTextField salaryField;
        private JTextField entryDateField;



        public AddEmployeeDialog(JFrame parent, DefaultTableModel model) {
            super(parent, "添加员工", true);
            setSize(400, 300);
            setLocationRelativeTo(parent);
            setLayout(new GridLayout(9, 2));
            JLabel idLabel = new JLabel("ID:");
            idField = new JTextField();
            JLabel nameLabel = new JLabel("姓名:");
            nameField = new JTextField();
            JLabel ageLabel = new JLabel("年龄:");
            ageField = new JTextField();
            JLabel phoneLabel = new JLabel("电话:");
            phoneField = new JTextField();
            JLabel salaryLabel = new JLabel("薪水:");
            salaryField = new JTextField();
            JLabel entryDateLabel = new JLabel("入职日期:");
            entryDateField = new JTextField();
            JLabel positionLabel = new JLabel("职位:");
            positionField = new JTextField();
            JLabel departmentLabel = new JLabel("部门:");
            departmentField = new JTextField();
            JButton addButton = new JButton("添加");
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    String position = positionField.getText();
                    String department = departmentField.getText();

                    if (!name.isEmpty() && !position.isEmpty() && !department.isEmpty()) {
                        model.addRow(new Object[]{model.getRowCount() + 1, name, position, department});
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(AddEmployeeDialog.this, "所有字段不能为空", "错误", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            add(ageLabel);
            add(ageField);
            add(phoneLabel);
            add(phoneField);
            add(salaryLabel);
            add(salaryField);
            add(entryDateLabel);
            add(entryDateField);
            add(idLabel);
            add(idField);
            add(nameLabel);
            add(nameField);
            add(positionLabel);
            add(positionField);
            add(departmentLabel);
            add(departmentField);
            add(new JLabel()); // 空标签用于对齐
            add(addButton);
        }
    }

    // 编辑员工对话框
    private static class EditEmployeeDialog extends JDialog {
        private JTextField nameField;
        private JTextField positionField;
        private JTextField departmentField;
        private DefaultTableModel model;
        private int rowIndex;

        public EditEmployeeDialog(JFrame parent, DefaultTableModel model, int rowIndex, int id) {
            super(parent, "编辑员工", true);
            this.model = model;
            this.rowIndex = rowIndex;
            setSize(400, 300);
            setLocationRelativeTo(parent);
            setLayout(new GridLayout(4, 2, 10, 10));

            JLabel nameLabel = new JLabel("姓名:");
            nameField = new JTextField((String) model.getValueAt(rowIndex, 1));

            JLabel positionLabel = new JLabel("职位:");
            positionField = new JTextField((String) model.getValueAt(rowIndex, 2));

            JLabel departmentLabel = new JLabel("部门:");
            departmentField = new JTextField((String) model.getValueAt(rowIndex, 3));

            JButton updateButton = new JButton("更新");
            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    String position = positionField.getText();
                    String department = departmentField.getText();

                    if (!name.isEmpty() && !position.isEmpty() && !department.isEmpty()) {
                        model.setValueAt(name, rowIndex, 1);
                        model.setValueAt(position, rowIndex, 2);
                        model.setValueAt(department, rowIndex, 3);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(EditEmployeeDialog.this, "所有字段不能为空", "错误", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            add(nameLabel);
            add(nameField);
            add(positionLabel);
            add(positionField);
            add(departmentLabel);
            add(departmentField);
            add(new JLabel()); // 空标签用于对齐
            add(updateButton);
        }
    }
}

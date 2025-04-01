package com.itheima.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//添加员工信息的界面
public class AddEmployeeUI extends JFrame {
        private JTextField idField;
        private JTextField nameField;
        private JComboBox<String> genderComboBox;
        private JTextField ageField;
        private JTextField phoneField;
        private JTextField positionField;
        private JTextField hireDateField;
        private JTextField salaryField;
        private JTextField departmentField;
        private JButton addButton;
        private JButton cancelButton;

        public AddEmployeeUI() {
            // 初始化界面
            setTitle("添加员工");
            setSize(400, 500);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);

            // 设置主面板和布局
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10);
            gbc.anchor = GridBagConstraints.WEST;

            // 添加组件
            addComponent(mainPanel, new JLabel("ID:"), gbc, 0, 0, 1, 1);
            idField = new JTextField(20);
            addComponent(mainPanel, idField, gbc, 1, 0, 1, 1);

            addComponent(mainPanel, new JLabel("姓名:"), gbc, 0, 1, 1, 1);
            nameField = new JTextField(20);
            addComponent(mainPanel, nameField, gbc, 1, 1, 1, 1);

            addComponent(mainPanel, new JLabel("性别:"), gbc, 0, 2, 1, 1);
            genderComboBox = new JComboBox<>(new String[]{"男", "女"});
            addComponent(mainPanel, genderComboBox, gbc, 1, 2, 1, 1);

            addComponent(mainPanel, new JLabel("年龄:"), gbc, 0, 3, 1, 1);
            ageField = new JTextField(20);
            addComponent(mainPanel, ageField, gbc, 1, 3, 1, 1);

            addComponent(mainPanel, new JLabel("电话:"), gbc, 0, 4, 1, 1);
            phoneField = new JTextField(20);
            addComponent(mainPanel, phoneField, gbc, 1, 4, 1, 1);

            addComponent(mainPanel, new JLabel("职位:"), gbc, 0, 5, 1, 1);
            positionField = new JTextField(20);
            addComponent(mainPanel, positionField, gbc, 1, 5, 1, 1);

            addComponent(mainPanel, new JLabel("入职时间:"), gbc, 0, 6, 1, 1);
            hireDateField = new JTextField(20);
            addComponent(mainPanel, hireDateField, gbc, 1, 6, 1, 1);

            addComponent(mainPanel, new JLabel("薪水:"), gbc, 0, 7, 1, 1);
            salaryField = new JTextField(20);
            addComponent(mainPanel, salaryField, gbc, 1, 7, 1, 1);

            addComponent(mainPanel, new JLabel("部门信息:"), gbc, 0, 8, 1, 1);
            departmentField = new JTextField(20);
            addComponent(mainPanel, departmentField, gbc, 1, 8, 1, 1);

            // 按钮面板
            JPanel buttonPanel = new JPanel();
            addButton = new JButton("添加");
            cancelButton = new JButton("取消");

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    addEmployee();
                }
            });

            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });

            buttonPanel.add(addButton);
            buttonPanel.add(cancelButton);

            gbc.gridx = 0;
            gbc.gridy = 9;
            gbc.gridwidth = 2;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            addComponent(mainPanel, buttonPanel, gbc, 0, 9, 2, 1);

            add(mainPanel);
            setVisible(true);
        }

        private void addComponent(JPanel panel, JComponent component, GridBagConstraints gbc, int x, int y, int width, int height) {
            gbc.gridx = x;
            gbc.gridy = y;
            gbc.gridwidth = width;
            gbc.gridheight = height;
            panel.add(component, gbc);
        }

        private void addEmployee() {
            try {
                int id = Integer.parseInt(idField.getText().trim());
                String name = nameField.getText().trim();
                String gender = (String) genderComboBox.getSelectedItem();
                int age = Integer.parseInt(ageField.getText().trim());
                String phone = phoneField.getText().trim();
                String position = positionField.getText().trim();
                String hireDate = hireDateField.getText().trim();
                double salary = Double.parseDouble(salaryField.getText().trim());
                String department = departmentField.getText().trim();

                if (name.isEmpty() || phone.isEmpty() || position.isEmpty() || hireDate.isEmpty() || department.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "所有字段不能为空", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // 这里可以添加将数据保存到数据库或其他存储的方式
                System.out.println("添加员工成功: ID=" + id + ", 姓名=" + name + ", 性别=" + gender + ", 年龄=" + age +
                        ", 电话=" + phone + ", 职位=" + position + ", 入职时间=" + hireDate +
                        ", 薪水=" + salary + ", 部门信息=" + department);

                dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "请输入有效的数字格式", "错误", JOptionPane.ERROR_MESSAGE);
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new AddEmployeeUI());
        }
    }




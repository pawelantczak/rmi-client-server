package org.antczak.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.antczak.rmi.remote.IWeatherForecast;
import org.antczak.rmi.resources.Messages;

public class WeatherClient extends javax.swing.JFrame {

	private static final long serialVersionUID = -5173137738857865522L;

	public WeatherClient() {
		super();
		initComponents();
		Calendar calendar = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); //$NON-NLS-1$

		calendar.add(Calendar.DAY_OF_MONTH, 1);
		jLabel7.setText(df.format(calendar.getTime()));
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		jLabel6.setText(df.format(calendar.getTime()));
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		jLabel5.setText(df.format(calendar.getTime()));
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		jLabel4.setText(df.format(calendar.getTime()));
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		jLabel3.setText(df.format(calendar.getTime()));
	}

	private void initComponents() {

		jComboBox1 = new javax.swing.JComboBox();
		jLabel1 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();
		jTextField8 = new javax.swing.JTextField();
		jTextField9 = new javax.swing.JTextField();
		jTextField10 = new javax.swing.JTextField();
		jTextField11 = new javax.swing.JTextField();
		jTextField12 = new javax.swing.JTextField();
		jTextField13 = new javax.swing.JTextField();
		jTextField14 = new javax.swing.JTextField();
		jTextField15 = new javax.swing.JTextField();
		jTextField16 = new javax.swing.JTextField();
		jTextField17 = new javax.swing.JTextField();
		jTextField18 = new javax.swing.JTextField();
		jTextField19 = new javax.swing.JTextField();
		jTextField20 = new javax.swing.JTextField();
		jTextField21 = new javax.swing.JTextField();
		jTextField22 = new javax.swing.JTextField();
		jTextField23 = new javax.swing.JTextField();
		jTextField24 = new javax.swing.JTextField();
		jTextField25 = new javax.swing.JTextField();
		jSeparator1 = new javax.swing.JSeparator();
		jButton1 = new javax.swing.JButton();
		jSeparator2 = new javax.swing.JSeparator();
		jLabel2 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle(Messages.getString("Weather.1")); //$NON-NLS-1$
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setForeground(java.awt.Color.white);
		setLocationByPlatform(true);
		setMinimumSize(null);
		setResizable(false);

		jComboBox1
				.setModel(new javax.swing.DefaultComboBoxModel(
						new String[] {
								Messages.getString("Weather.2"), Messages.getString("Weather.3") })); //$NON-NLS-1$ //$NON-NLS-2$

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel1.setText(Messages.getString("Weather.5")); //$NON-NLS-1$

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel8.setText(Messages.getString("Weather.12")); //$NON-NLS-1$

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel9.setText(Messages.getString("Weather.14")); //$NON-NLS-1$

		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel10.setText(Messages.getString("Weather.16")); //$NON-NLS-1$

		jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel11.setText(Messages.getString("Weather.18")); //$NON-NLS-1$

		jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel12.setText(Messages.getString("Weather.20")); //$NON-NLS-1$

		jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField1.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField2.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField3.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField4.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField5.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField6.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField7.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField8.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField9.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField10.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField11.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField12.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField13.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField14.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField15.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField16.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField17.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField18.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField19.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField20.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField21.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField22.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField23.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField24.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField25.setText(Messages.getString("Weather.21")); //$NON-NLS-1$

		jButton1.setText(Messages.getString("Weather.46")); //$NON-NLS-1$
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N //$NON-NLS-1$
		jLabel2.setText(Messages.getString("Weather.48")); //$NON-NLS-1$

		jLabel13.setText(Messages.getString("Weather.49")); //$NON-NLS-1$

		jMenu1.setText(Messages.getString("Weather.50")); //$NON-NLS-1$

		jMenuItem1.setText(Messages.getString("Weather.51")); //$NON-NLS-1$
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jSeparator1,
						javax.swing.GroupLayout.Alignment.TRAILING)
				.addComponent(jSeparator2,
						javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jComboBox1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		109,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jButton1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		108,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jLabel12,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel11,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel10,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel9,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel8))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jTextField5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										85,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextField10))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jTextField4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										85,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextField9))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jTextField3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										85,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextField8))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jTextField2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										85,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextField7))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																												.addComponent(
																														jTextField1)
																												.addComponent(
																														jLabel7,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														85,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																												.addComponent(
																														jLabel6,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE)
																												.addComponent(
																														jTextField6,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														85,
																														javax.swing.GroupLayout.PREFERRED_SIZE))))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jTextField14,
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jTextField13,
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jTextField12,
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jTextField11,
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel5,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						85,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						jLabel4,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField16)
																				.addComponent(
																						jTextField17)
																				.addComponent(
																						jTextField18)
																				.addComponent(
																						jTextField19)
																				.addComponent(
																						jTextField20,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						85,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						jLabel3,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField21)
																				.addComponent(
																						jTextField22)
																				.addComponent(
																						jTextField23)
																				.addComponent(
																						jTextField24)
																				.addComponent(
																						jTextField25,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						85,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel13,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		453,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(jComboBox1)
												.addComponent(jButton1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(
														jLabel6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														14,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														14,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														14,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														14,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel8,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														22,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField11,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField16,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField21,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														22,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField7,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField12,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField17,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField22,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jLabel10,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														22,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jTextField3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jTextField8,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jTextField13,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jTextField18,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jTextField23,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel11,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField14,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField19,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField24,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jLabel12,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														22,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jTextField5,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jTextField10,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jTextField15,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jTextField20,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jTextField25,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(18, 18, 18)
								.addComponent(jSeparator2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										9,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jLabel13))
								.addContainerGap()));

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		IWeatherForecast weather = null;
		String[][] conditions = new String[5][5];

		try {
			if (weather == null) {
				weather = (IWeatherForecast) Naming
						.lookup("rmi://localhost/weather"); //$NON-NLS-1$
			}
			conditions = weather.getConditions(jComboBox1.getSelectedItem()
					.toString());
			jLabel13.setText(Messages.getString("Weather.53")); //$NON-NLS-1$
		} catch (Exception ex) {
			jLabel13.setText(Messages.getString("Weather.54") + ex.getLocalizedMessage()); //$NON-NLS-1$
		}

		jTextField1.setText(conditions[0][0]);
		jTextField2.setText(conditions[0][1]);
		jTextField3.setText(conditions[0][2]);
		jTextField4.setText(conditions[0][3]);
		jTextField5.setText(conditions[0][4]);
		jTextField6.setText(conditions[1][0]);
		jTextField7.setText(conditions[1][1]);
		jTextField8.setText(conditions[1][2]);
		jTextField9.setText(conditions[1][3]);
		jTextField10.setText(conditions[1][4]);
		jTextField11.setText(conditions[2][0]);
		jTextField12.setText(conditions[2][1]);
		jTextField13.setText(conditions[2][2]);
		jTextField14.setText(conditions[2][3]);
		jTextField15.setText(conditions[2][4]);
		jTextField16.setText(conditions[3][0]);
		jTextField17.setText(conditions[3][1]);
		jTextField18.setText(conditions[3][2]);
		jTextField19.setText(conditions[3][3]);
		jTextField20.setText(conditions[3][4]);
		jTextField21.setText(conditions[4][0]);
		jTextField22.setText(conditions[4][1]);
		jTextField23.setText(conditions[4][2]);
		jTextField24.setText(conditions[4][3]);
		jTextField25.setText(conditions[4][4]);

	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		this.dispose();
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) { //$NON-NLS-1$
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(WeatherClient.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(WeatherClient.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(WeatherClient.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(WeatherClient.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		System.setSecurityManager(new RMISecurityManager());
		new WeatherClient().setVisible(true);

	}

	private javax.swing.JButton jButton1;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField13;
	private javax.swing.JTextField jTextField14;
	private javax.swing.JTextField jTextField15;
	private javax.swing.JTextField jTextField16;
	private javax.swing.JTextField jTextField17;
	private javax.swing.JTextField jTextField18;
	private javax.swing.JTextField jTextField19;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField20;
	private javax.swing.JTextField jTextField21;
	private javax.swing.JTextField jTextField22;
	private javax.swing.JTextField jTextField23;
	private javax.swing.JTextField jTextField24;
	private javax.swing.JTextField jTextField25;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
}

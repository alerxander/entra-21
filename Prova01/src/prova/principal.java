package prova;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.text.MaskFormatter;

public class principal {

	public static void main(String[] args) {

		boolean menu = false, lopnome = false, valida = false, valida2 = false, valida3 = false, valida4 = false,
				valida5 = false, pagamentos = false;
		double desconto = 0, somatotal = 0, MaiorC = 0, MenorC = 1000.00, comparacao = 0;

		int numeroCliente = 0;
		int homem = 0, mulher = 0;
		int idade17 = 0, idade18 = 0, idade31 = 0, idade50 = 0;
		int audio = 0, informatica = 0, telefonia = 0, vestuari = 0;
		String maiorCompra = "", menorCompra = "", nome = "";
		while (menu == false) {
			Object[] opcaosair = { "Sim", "N„o" };
			int opcao = JOptionPane.showOptionDialog(null, "Deseja realmente ultilizar o sistema", "Sistema",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, opcaosair, 0);
			if (opcao == 0) {
				lopnome=false;
				while (lopnome == false) {
					try {
						nome = JOptionPane.showInputDialog("Digite seu nome!");
						if (nome.equals("")) {
							lopnome = false;
						} else {
							lopnome = true;
							numeroCliente++;
						}

					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "informe apenas numeros inteiros!");
						lopnome = false;
					}

				}
				Object[] sexo = { "masculino", "feminino" };
				int sexo1 = JOptionPane.showOptionDialog(null, "Menu", "Sistema", JOptionPane.PLAIN_MESSAGE,
						JOptionPane.INFORMATION_MESSAGE, null, sexo, 0);
				if (sexo1 == 0) {
					homem++;
				} else if (sexo1 == 1) {
					mulher++;
				}
				Object[] idades = { "AtÈ 17 anos", "Entre 18 e 30 anos", "Entre 31 e 50 anos", "Acima de 50 anos" };
				int idade = JOptionPane.showOptionDialog(null, "Quantos Anos vocÍ tem", "Sistema",
						JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, idades, 0);
				if (idade == 0) {
					idade17++;
				} else if (idade == 1) {
					idade18++;
				} else if (idade == 2) {
					idade31++;
				} else if (idade == 3) {
					idade50++;
				}
				while (valida == false) {
					Object[] menu1 = { "audio/video", "Inform·tica", "Telefonia", "Vestuario" };
					int menuaudio = JOptionPane.showOptionDialog(null, "Menu", "Sistema", JOptionPane.PLAIN_MESSAGE,
							JOptionPane.INFORMATION_MESSAGE, null, menu1, 0);
					if (menuaudio == 0) {
						valida = false;
						valida2 = false;
						while (valida2 == false) {
							Object[] submenu = { "TVs", "Aparelho de som", "voltar ao menu anterio" };
							int submenuTv = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
									JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, submenu, 0);

							if (submenuTv == 0) {
								Object[] submenuTv1 = { "Smart TV Led 49 Samsung - R$ 4.999,99",
										"Smart TV 4k LG 60 - R$7.499,00", "Smart TV Full HD 32 Samsung - R$ 1.710,00 ",
										"voltar ao menu anterior" };
								int submenuTv01 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
										JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, submenuTv1,
										0);

								if (submenuTv01 == 0) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 4999.99;
										valida2 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 4999.99) * 0.05;
											audio++;

										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 4999.99) - desconto;
											audio++;
										}
									}
									if(continua==0) {
										valida2=false;
									}else {
										valida2=true;
									}
									valida = true;
									
								} else if (submenuTv01 == 1) {

									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 7499.00;
										valida2 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 7499.00) * 0.05;
											audio++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 7499.00) - desconto;
											audio++;
										}
									}
									if(continua==0) {
										valida2=false;
									}else {
										valida2=true;
									}
									
									valida = true;

								} else if (submenuTv01 == 2) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 1710.00;
										valida2 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 1710.00) * 0.05;
											audio++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 1710.00) - desconto;
											audio++;
										}
									}
									if(continua==0) {
										valida2=false;
									}else {
										valida2=true;
									}
									valida = true;
								} else if (submenuTv01 == 3) {

									valida2 = false;

								}
								valida = true;
							}

							else if (submenuTv == 1) {
								Object[] menuSom = { "Semp Toshiba ¡udio Bright - R$ 599,99 ",
										"Mini System LG - R$ 512,00 ", " Mini System Philco - R$ 499,99 ",
										"voltar ao menu anterio" };
								int submenuSom01 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
										JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, menuSom, 0);

								if (submenuSom01 == 0) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 599.99;
										valida2 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 599.99) * 0.05;
											audio++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 599.99) - desconto;
											audio++;
										}

										if(continua==0) {
											valida2=false;
										}else {
											valida2=true;
										}
										valida = true;
									}
								} else if (submenuSom01 == 1) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 512.00;
										audio++;
										valida2 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 512.00) * 0.05;
											audio++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 512.00) - desconto;
											audio++;
										}

									}

									if(continua==0) {
										valida2=false;
									}else {
										valida2=true;
									}
									valida = true;

								} else if (submenuSom01 == 2) {

									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 499.00;
										audio++;
										valida2 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 499.00) * 0.05;
											audio++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 499.00) - desconto;
											audio++;
										}
									}

									if(continua==0) {
										valida2=false;
									}else {
										valida2=true;
									}
									valida = true;
								} else if (submenuSom01 == 3) {
									valida2 = false;
								}
								valida = false;

							} else if (submenuTv == 2) {
								valida2 = true;
								valida=false;

							}
						}
					} else if (menuaudio == 1) {
						valida3 = false;
						while (valida3 == false) {
							Object[] menuinf = { "Hardware", "Software ", "valtar ao menu anterior" };
							int menuinf1 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
									JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, menuinf, 0);
							if (menuinf1 == 0) {
								valida = true;

								Object[] menuinf2 = { "Placa M„e Asus - R$ 2.000,00 ",
										"MemÛria Ram Corsair 4GB - R$500,00", "Mouse Multilaser - R$59,90 ",
										"vaoltar ao menu anterior" };
								int menuinf02 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
										JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, menuinf2, 0);
								if (menuinf02 == 0) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 2000.00;
										informatica++;
										valida3 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 2000.00) * 0.1;
											informatica++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 2000.00) - desconto;
											informatica++;
										}
									}
									valida3 = true;
									valida = true;
									if(continua==0) {
										valida3=false;
									}else {
										valida3=true;
									}
								} else if (menuinf02 == 1) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 500.00;
										informatica++;
										valida3 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 500.00) * 0.1;
											informatica++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 500.00) - desconto;
											informatica++;
										}

										valida3 = true;
										valida = true;

									}
									if(continua==0) {
										valida3=false;
									}else {
										valida3=true;
									}
								} else if (menuinf02 == 2) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 59.90;
										informatica++;
										valida3 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 59.90) * 0.1;
											informatica++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 59.90) - desconto;
											informatica++;
										}
										valida3 = true;
										valida = true;
									}
									if(continua==0) {
										valida3=false;
									}else {
										valida3=true;
									}
								} else if (menuinf02 == 3) {
									valida3 = false;

								}

							}

							else if (menuinf1 == 1) {
								Object[] menuinf3 = { "Windows 10  - R$500,00 ", "Office 2019   - R$399,99 ",
										"AutoCard 3D - R$899,50 ", "voltar ao menu anterior" };
								int menuinf03 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
										JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, menuinf3, 0);
								if (menuinf03 == 0) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 500.00;
										informatica++;
										valida3 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 500.00) * 0.1;
											informatica++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 500.00) - desconto;
											informatica++;
										}

										valida3 = true;
										valida = true;
									}if(continua==0) {
										valida3=false;
									}else {
										valida=true;
									}
									if(continua==0) {
										valida3=false;
									}else {
										valida3=true;
									}
								} else if (menuinf03 == 1) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 399.99;
										informatica++;
										valida3 = false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 399.99) * 0.1;
											informatica++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 399.99) - desconto;
											informatica++;
										}

										valida3 = true;
										valida = true;
									}
								 else if (menuinf03 == 2) {
									valida3 = false;
								}if(continua==0) {
									valida4=false;
								}else {
									valida4=true;
								}
								if(continua==0) {
									valida3=false;
								}else {
									valida3=true;
								}
							} else if (menuinf1 == 2) {

								int qtdTv = Integer.parseInt(JOptionPane
										.showInputDialog("informe a quantidade que deseja comprar do produto"));
								Object[] continuar = { "sim", "N„o" };
								int continua = JOptionPane.showOptionDialog(null,
										"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
										JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
								if (continua == 0) {
									somatotal += qtdTv * 899.50;
									informatica++;
									valida3 = false;
								} else if (continua == 1) {
									Object[] pagamento = { "A Prazo", "A vista" };
									int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
											"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
											null, pagamento, 0);
									if (Pagamento == 0) {
										desconto = (qtdTv * 899.50) * 0.1;
										informatica++;
									} else if (Pagamento == 1) {
										somatotal += (qtdTv * 899.50) - desconto;
										informatica++;
									}
									else if(menuinf1 == 2) {
									valida3 = true;
									valida = true;
								}
									if(continua==0) {
										valida3=false;
									}else {
										valida3=true;
									}
								}
							 else if (menuinf03 == 3) {
								valida3 = false;
							}if(continua==0) {
								valida4=false;
							}else {
								valida4=true;
							}							
						
							
							}
								valida3 = true;
								valida = false;
						}
							else if (menuinf1 == 1) {
								
							}
					else if (menuaudio == 2) {
						valida4 = false;
						while (valida4 == false) {
							Object[] telefones = { " Smartphones ", " Tablets ", "Voltar ao menu anterior" };
							int telefones1 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
									JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, telefones, 0);

							if (telefones1 == 0) {
								Object[] telefones01 = { "Iphone 10 - R$4.500,00", "Sansung S10 - R$4.000,00",
										"Moto G8 Plus R$3.990,00", "voltar ao menu anterior" };
								int telefones001 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
										JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, telefones01,
										0);
								if (telefones001 == 0) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 4500.00;
										telefonia++;
										valida4=false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 4500.00) * 0.15;
											telefonia++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 4500.00) - desconto;
											telefonia++;
										}
										if(continua==0) {
											valida4=false;
										}else {
											valida4=true;
										}
										valida = true;
									}
									
								} else if (telefones001 == 1) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 4000.00;
										telefonia++;
										valida4=false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 4000.00) * 0.15;
											telefonia++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 4000.00) - desconto;
											telefonia++;
										}
										if(continua==0) {
											valida4=false;
										}else {
											valida4=true;
										}
										valida = true;
									}

								} else if (telefones001 == 2) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 3990.00;
										telefonia++;
										valida4=false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 3990.00) * 0.15;
											telefonia++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 3990.00) - desconto;
											telefonia++;
										}
									}
									if(continua==0) {
										valida4=false;
									}else {
										valida4=true;
									}
									valida = true;

								} else if (telefones001 == 3) {
									valida4 = false;
								}
							} else if (telefones1 == 1) {
								Object[] tablets = { "Voltar ao menu anterior" };
								int tablets1 = JOptionPane.showOptionDialog(null, "Estamos sem Tablets no estoque",
										"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null,
										tablets, 0);
								if (tablets1 == 0) {
									valida4 = false;

								}
							} else if (telefones1 == 2) {
								valida4 = true;
								valida = false;
							}

						}
					} else if (menuaudio == 3) {
						while (valida5 == false) {
							Object[] vestuario = { "Masculino", "Feminino", "voltar ao menu anterior" };
							int vestuario1 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
									JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, vestuario, 0);
							if (vestuario1 == 0) {
								Object[] vestuarioM = { "Camisa Social Lacoste - R$ 200,00",
										"CalÁa Jeans Calvin Klein R$ 230,00 ", "Camisa Social Dudalina - R$ 130,00",
										"Voltar ao menu anterior" };
								int vestuario01 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
										JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, vestuarioM,
										0);
								if (vestuario01 == 0) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 200.00;
										vestuari++;
										valida5=false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 200.00) * 0.2;
											vestuari++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 200.00) - desconto;
											vestuari++;
										}
									}
									valida5 = true;
									valida = true;
								} else if (vestuario01 == 1) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 230.00;
										vestuari++;
										valida5=false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 230.00) * 0.2;
											vestuari++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 230.00) - desconto;
											vestuari++;
										}
									}
									valida5 = true;
									valida = true;
								} else if (vestuario01 == 2) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 130.00;
										vestuari++;
										valida5=false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 130.00) * 0.2;
											vestuari++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 130.00) - desconto;
											vestuari++;
										}
										valida5 = true;
										valida = true;
									}

								} else if (vestuario1 == 3) {
									valida5 = false;
								}
							} else if (vestuario1 == 1) {
								Object[] vestuarioF = { "Camisa Social Dudalina - R$170,00",
										"CalÁa Jeans Miss Masi - R$ 99,90", "Bermuda Dijean - R$ 74,40",
										"Voltar ao menu anterior" };
								int vestuario2 = JOptionPane.showOptionDialog(null, "Menu", "Sistema",
										JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, vestuarioF,
										0);
								if (vestuario2 == 0) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 170.00;
										vestuari++;
										valida5=false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 170.00) * 0.2;
											vestuari++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 170.00) - desconto;
											vestuari++;
										}
									}
									valida5 = true;
									valida = true;
								} else if (vestuario2 == 1) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 99.90;
										vestuari++;
										valida5=false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 99.90) * 0.2;
											vestuari++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 99.90) - desconto;
											vestuari++;
										}
									}
									valida5 = true;
									valida = true;
								} else if (vestuario2 == 2) {
									int qtdTv = Integer.parseInt(JOptionPane
											.showInputDialog("informe a quantidade que deseja comprar do produto"));
									Object[] continuar = { "sim", "N„o" };
									int continua = JOptionPane.showOptionDialog(null,
											"Deseja comprar mais algum produto?", "Sistema", JOptionPane.PLAIN_MESSAGE,
											JOptionPane.INFORMATION_MESSAGE, null, continuar, 0);
									if (continua == 0) {
										somatotal += qtdTv * 74.40;
										vestuari++;
										valida5=false;
									} else if (continua == 1) {
										Object[] pagamento = { "A Prazo", "A vista" };
										int Pagamento = JOptionPane.showOptionDialog(null, "Forma de Pagamento",
												"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
												null, pagamento, 0);
										if (Pagamento == 0) {
											desconto = (qtdTv * 74.40) * 0.2;
											vestuari++;
										} else if (Pagamento == 1) {
											somatotal += (qtdTv * 74.40) - desconto;
											vestuari++;
										}
									}
									valida5 = true;
									valida = true;
								} else if (vestuario2 == 3) {
									valida5 = false;
								}

							} else if (vestuario1 == 2) {
								valida5 = true;
								valida = false;
							}
						}
					}
				}
				if (somatotal > MaiorC) {
					MaiorC = somatotal;
					maiorCompra = nome;
				} else if (somatotal < MenorC) {
					MenorC = somatotal;
					menorCompra = nome;
				}

				while (pagamentos == false) {
					int valorPagamento = Integer.parseInt(JOptionPane.showInputDialog(
							"o valor da sua compra ficou em " + somatotal + "informe o valor a ser pago"));
					if (valorPagamento < somatotal) {
						JOptionPane.showMessageDialog(null,
								"Valor insuficiente para realizar a compra,tente novamente");
					} else if (valorPagamento >= somatotal) {
						pagamentos = true;
					}
				}

				Object[] cliente = { "sim", "N„o" };
				int perCliente = JOptionPane.showOptionDialog(null, "Mais algum cliente deseja realizar alguma compra?",
						"Sistema", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, cliente, 0);

				if (perCliente == 0) {
					menu = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"A Quantidade de clientes que utilizaram o sistema foi de" + numeroCliente
									+ "\nA quantidade de homens cadastrado foi de " + homem + "e " + mulher
									+ "Mulheres com o percentual de:\n" + (100 / numeroCliente) * homem + "% Homens e"
									+ (100 / numeroCliente) * mulher + "% Mulheres");

					JOptionPane.showMessageDialog(null,
							"Cadastrados com idade ate 17 anos:" + idade17 + "\n Entre 18 e 30: " + idade18
									+ "\n Entre 31 e 50: " + idade31 + "\n Acima de 50: " + idade50);

					JOptionPane.showMessageDialog(null,
							"A quantidade de produto adquirida de cada departamento foi:\n¡udio/VÌdeo = " + audio
									+ "\nInform·tica = " + informatica + "\nTelefonia = " + telefonia + "\nVestu·rio = "
									+ vestuari);
					menu = true;
				}
			}

		}

	}
}
	}
}

/*
 * Copyright (C) 2024 aluno
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package avalicao.n1;
import java.util.Scanner;
/**
 *
 * @author Pedro Spindola
 * @date 08/03/2024
 * @brief Class Exercicios01
 */
public class Prova1 {
        public static void main(String[] args) {
        
            // Inicializando as variavel
        boolean exit = false, conta = false;
        int opcao, remover, pag, parc = 0;
        int qde_expresso=0, qde_capuccino=0, qde_leite_com_cafe=0, qde_cafes_tradicional=0, qde_leite=0, qde_de_itens=0;
        double valor_expresso, valor_capuccino, valor_leite_com_cafe, valor_tradicional, valor_leite, valor_itens_vendidos=0;
        
        Scanner sc = new Scanner(System.in);
        
        // Laço para fazer o menu de pedido.
        do {
                System.out.println("Forneça uma opção: \n"+"1 - Café expresso: \n"+"2 - Café capuccino: \n"+"3 - Leite com café: \n"+"4 - Café tradicional: \n"+"5 - Leite: \n"+"6 - Excluir itens da lista: \n"+"7 - Totalizar vendas:");
      
                opcao = sc.nextInt();   // Vai receber o valor de entrada do usuario.
                
                // Processar qual o pedido com uma estrutura condicional.
                if (opcao == 1){
                    qde_expresso++;
                }else if (opcao == 2){
                    qde_capuccino++;
                }else if (opcao == 3){
                    qde_leite_com_cafe++;
                }else if (opcao == 4){
                    qde_cafes_tradicional++;
                }else if (opcao == 5){
                    qde_leite++;
                }else if (opcao == 6){
                   
                    do {
                        // No caso de seleção de remover item, vamos iniciar um novo loop.
                        
                        System.out.println("Qual item deseja remover?"+"\n 1 - Qde café expresso: "+qde_expresso+"\n 2 - Qde café capuccino: "+qde_capuccino+"\n 3 - Qde leite com café: "+qde_leite_com_cafe+"\n 4 - Qde café tradicional: "+qde_cafes_tradicional+"\n 5 - Qde leite: "+qde_leite+"\n 6 - Volta para o menu:");
                    
                        remover = sc.nextInt(); // Receber dados de entrada do usuario.
                        
                        // Processar qual o pedido com uma estrutura condicional.
                        if (remover == 1){
                            if (qde_expresso != 0){
                                qde_expresso--;
                            } else { System.out.println("Não possui esse item no carrinho."); }
                        }else if (remover == 2){
                            if (qde_capuccino != 0){
                                qde_capuccino--;
                            } else { System.out.println("Não possui esse item no carrinho."); }
                        }else if (remover == 3){
                            if (qde_leite_com_cafe != 0){
                                qde_leite_com_cafe--;
                            } else { System.out.println("Não possui esse item no carrinho."); }
                        }else if (remover == 4){
                            if (qde_cafes_tradicional != 0){
                                qde_cafes_tradicional--;
                            } else { System.out.println("Não possui esse item no carrinho."); }
                        }else if (remover == 5){
                            if (qde_leite != 0){
                                qde_leite--;
                            } else { System.out.println("Não possui esse item no carrinho."); }
                        }else if (remover == 6){
                            System.out.println("Opção inválida");
                        }
                    } while ( remover != 6); //Fim do loop
                   
                }else if (opcao != 7){
                    System.out.println("Opção inválida");
                }
                
        } while ( opcao != 7); // Fim do loop, caso a condição seja falsa
    
        valor_expresso = qde_expresso*0.75;
        valor_capuccino = qde_capuccino;    
        valor_leite_com_cafe = qde_leite_com_cafe*1.25;
        valor_tradicional = qde_cafes_tradicional*0.25;
        valor_leite = qde_leite;
        
        qde_de_itens = qde_expresso + qde_capuccino + qde_leite_com_cafe + qde_cafes_tradicional + qde_leite;
        
        valor_itens_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe + valor_tradicional + valor_leite;
        
        System.out.println("Qde café expresso: "+qde_expresso+" ­ valor: R$"+valor_expresso);
        System.out.println("Qde café capuccino: "+qde_capuccino+" ­ valor: R$"+valor_capuccino);    
        System.out.println("Qde leite com café: "+qde_leite_com_cafe+ " ­ valor: R$"+valor_leite_com_cafe);
        System.out.println("Qde café tradicional: "+qde_cafes_tradicional+" ­ valor: R$"+valor_tradicional);    
        System.out.println("Qde leite: "+qde_leite+ " ­ valor: R$"+valor_leite);
        System.out.println("Qde itens vendidos: "+ qde_de_itens + " ­ valor cafés vendidos: R$"+valor_itens_vendidos);
        
        do {
            System.out.println("Selecione o metódo de pagamento. \n"+"1 - À vista: \n"+"2 - Parcelado: \n"+"3 - Finalizar programa.");
            
            pag = sc.nextInt(); // Receber dados de entrada do usuario.
            
            if (pag == 1){
                System.out.println("Valor total: R$" + valor_itens_vendidos + "\n Pagamento aprovado.");
                conta = true;
            } else if (pag == 2){
                do{
                    System.out.println("Parcelar em quantas vezes?"+"\n 1 - 2x de R$"+(valor_itens_vendidos / 2 )+"\n 2 - 3x de R$"+(valor_itens_vendidos / 3 )+"\n 3 - 4x de R$"+(valor_itens_vendidos / 4 ));
                    parc = sc.nextInt(); // Receber dados de entrada do usuario.
                
                    if(parc == 1) {
                        System.out.println("Valor Parcelado em 2x: R$" + (valor_itens_vendidos / 2) + "\n Pagamento aprovado.");
                        conta = true;
                        break;
                    } else if(parc == 2) {
                        System.out.println("Valor Parcelado em 3x: R$" + (valor_itens_vendidos / 3) + "\n Pagamento aprovado.");
                        conta = true;
                        break;
                    } else if(parc == 3) {
                        System.out.println("Valor Parcelado em 4x: R$" + (valor_itens_vendidos / 4) + "\n Pagamento aprovado.");
                        conta = true;
                        break;
                    } else {
                        System.out.println("Opção inválida");
                    }
                } while(true);
                
            } else if (pag == 3){
                if (conta == true){
                    exit = true;
                } else {
                    System.out.println("Conta em aberta.");
                }
            } else if (pag != 3){
                System.out.println("Opção inválida");
            }
            
        } while (exit == false);     
    }
}

import java.util.Scanner;
public class IdandPwd {

 public static void main (String []args)
 
 {
  String id1;
  String pwd1;  
  String id2;
  String pwd2;
  
  Scanner sc= new Scanner(System.in);
  
  System.out.println("���̵� �Է� ���ּ���");
  id1=sc.next();
  
  System.out.println("��й�ȣ�� �Է� ���ּ���");
  pwd1=sc.next();
  
  
  System.out.println("���̵� �ѹ� �� �Է� ���ּ���");
  id2=sc.next();
  
  System.out.println("��й�ȣ�� �ѹ� �� �Է� ���ּ���");
  pwd2=sc.next();
  
         
  if (pwd1.equals(pwd2) && id1.compareTo(id2)!=0)
  System.out.println("���̵� ��ġ���� �ʽ��ϴ�"); 
  
  else if (id1.equals(id2) && pwd1.compareTo(pwd2)!=0)
  System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�"); 
  
  
  else if(id1.equals(id2) && pwd1.equals(pwd2))
  System.out.println("�Է��Ͻ� ���̵�� ��й�ȣ�� ��� ��Ȯ �մϴ�");
  
  else
  System.out.println("�Է��Ͻ� ���̵�� ��й�ȣ ��� ��ġ���� �ʽ��ϴ�");
  
 }
 
}
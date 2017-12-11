import java.util.Scanner;
public class IdandPwd {

 public static void main (String []args)
 
 {
  String id1;
  String pwd1;  
  String id2;
  String pwd2;
  
  Scanner sc= new Scanner(System.in);
  
  System.out.println("아이디를 입력 해주세요");
  id1=sc.next();
  
  System.out.println("비밀번호를 입력 해주세요");
  pwd1=sc.next();
  
  
  System.out.println("아이디를 한번 더 입력 해주세요");
  id2=sc.next();
  
  System.out.println("비밀번호를 한번 더 입력 해주세요");
  pwd2=sc.next();
  
         
  if (pwd1.equals(pwd2) && id1.compareTo(id2)!=0)
  System.out.println("아이디가 일치하지 않습니다"); 
  
  else if (id1.equals(id2) && pwd1.compareTo(pwd2)!=0)
  System.out.println("비밀번호가 일치하지 않습니다"); 
  
  
  else if(id1.equals(id2) && pwd1.equals(pwd2))
  System.out.println("입력하신 아이디와 비밀번호가 모두 정확 합니다");
  
  else
  System.out.println("입력하신 아이디와 비밀번호 모두 일치하지 않습니다");
  
 }
 
}
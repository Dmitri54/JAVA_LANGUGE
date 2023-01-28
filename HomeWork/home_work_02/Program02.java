// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга 
//   (вхождение в обратном порядке). 

package HomeWork.home_work_02;

public class Program02 {
    
    static boolean checkForRotation (String str1, String str2)
    {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
    public static void main (String[] args)
    {
        String str1 ="ABACD";
        String str2 ="CDABA";
        // String str1 ="7&Hello!false1.901";
        // String str2 ="109.1eslaf!olleH&7";
		    System.out.println("Данные строки: "+str1+"  и  "+str2);
		    System.out.println("\nКонкатенация первой строки дважды: "+str1+str1);
        if (checkForRotation(str1, str2))
        {
		    System.out.println("Вторая строка "+str2+" существует в новой строке.");	
        }
        else
        {
          	System.out.println("Вторая строка "+str2+"  не существует в новой строке.");	
            System.out.printf("\nСтроки не являются поворотами друг друга");
        }
    }
}


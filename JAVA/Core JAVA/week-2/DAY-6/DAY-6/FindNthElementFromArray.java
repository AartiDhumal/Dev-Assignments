import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//Q6)Try to get the nth index element from an array. Accept index value from user
class Array_finder{
    int Array1 [] = {1,2,4,5,6,7,8};
    Scanner scanner = new Scanner(System.in);
    void compare(){
        System.out.println("Enter an element you want to search: ");
        int input = scanner.nextInt();
        for (int i = 0; i< Array1.length; i++){
            if (Array1[i] == input){
                System.out.println("Number found");
                break;
            }
            else
                System.out.println("Number not found");
        }
    }

}

public class FindNthElementFromArray {
    public static void main(String[] args) {
        Array_finder array_finder = new Array_finder();
        array_finder.compare();
    }
}


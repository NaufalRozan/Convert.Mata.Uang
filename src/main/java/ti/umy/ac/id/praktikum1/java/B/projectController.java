/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.ac.id.praktikum1.java.B;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ACER
 */
@Controller
@ResponseBody
public class projectController {
    @RequestMapping ("/SingaporeRupiah")
    public String getDollarRupiah()
    {
        float angka1 = (float) 1;
        float angka2 = (float) 10578.84;
        float toRupiah = angka1 * angka2;
        return angka1 + " SDG" + " = " + "Rp. " + toRupiah;
    }
    
    @RequestMapping ("/RupiahDollar")
    public String getRupiahDollar()
    {
        float angka1 = (float) 1;
        float angka2 = (float) 0.00007;
        float toRupiah = angka1 * angka2;
        return "Rp. " + angka1 + " = " + toRupiah+ " Dollar";
    }
    
    @RequestMapping ("/RinggitRupiah")
    public String getRinggitRupiah()
    {
        float angka1 = (float) 1;
        float angka2 = (float) 3407.52;
        float toRupiah = angka1 * angka2;
        return angka1 + " Ringgit" + " = " + "Rp. " + toRupiah;
    }
    
     @RequestMapping ("/DollarRinggit")
    public String getDollarRinggit()
    {
        float angka1 = (float) 1;
        float angka2 = (float) 4.15;
        float toRupiah = angka1 * angka2;
        return angka1 + " Dollar" + " = " + toRupiah + " Ringgit";
    }
}

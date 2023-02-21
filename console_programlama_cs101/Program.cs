using System;

namespace cs_101
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Console.WriteLine("Merhabalar!");
            Console.WriteLine("İsim Soyisim Giriniz: ");
            string nameSurname = Console.ReadLine();
            Console.WriteLine("Telefon numaranızı giriniz: ");
            string phoneNum = Console.ReadLine();
            Console.WriteLine("İsim Soyisim: " + nameSurname + " Telefon Numarası: " + phoneNum);
        }
    }
}

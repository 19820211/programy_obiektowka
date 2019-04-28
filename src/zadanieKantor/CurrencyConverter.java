package zadanieKantor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;

public class CurrencyConverter {
    private static String VIEW = "ultra";
    private static String KEY = " ";

    public static double convert(Currency from, Currency to) {

        try {
            URL url = new URL("http://free.currencyconverterapi.com/api/v6/convert"
                    + "?q=" + from.getName()
                    + "_" + to.getName()
                    + "&compact="
                    + VIEW
                    + "&apiKey="
                    + KEY
            );
            System.out.println(url.toString());
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            for (int i = 0; i < reader.readLine().length(); i++) {
                System.out.println(reader.readLine());
            }

            String line = reader.readLine();

            if (line.length() > 0) {
                reader.close();
                int startIndex = line.indexOf(":") + 1;//String - wartości do dwukropka
                int endIndex = line.indexOf("}");//String do klamry zamykającej
                String value = line.substring(startIndex, endIndex);
                return Double.parseDouble(value);
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("zly URL");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}

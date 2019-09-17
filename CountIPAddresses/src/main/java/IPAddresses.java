public class IPAddresses {
    public static String number_of_ips_in_range(String strIp1, String strIp2) {
        String[] arrayIp1 = strIp1.split("\\.");
        String[] arrayIp2 = strIp2.split("\\.");
        int result = 0;


        if(!arrayIp1[0].equals(arrayIp2[0])) {
            result += (Integer.parseInt(arrayIp2[0]) - Integer.parseInt(arrayIp1[0])) * 256 * 256 * 256;
        }

        if(!arrayIp1[1].equals(arrayIp2[1])) {
            result += (Integer.parseInt(arrayIp2[1]) - Integer.parseInt(arrayIp1[1])) * 256 * 256;
        }

        if(!arrayIp1[2].equals(arrayIp2[2])) {
            result += (Integer.parseInt(arrayIp2[2]) - Integer.parseInt(arrayIp1[2])) * 256;
        }

        result += Integer.parseInt(arrayIp2[3]) - Integer.parseInt(arrayIp1[3]) +1;


        return String.valueOf(result);
    }
}

package org.haox.kerb.client;

public class Kinit {

    /**
     * kinit like tool
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 2 || args.length > 3) {
            System.err.println(
                    "Usage: " + Kinit.class.getSimpleName() +
                            " <kdcHost> <kdcPort>");
            return;
        }

        final String host = args[0];
        final Integer port = Integer.parseInt(args[1]);
        KrbClient krbClnt = new KrbClient(host, port.shortValue());
    }

}

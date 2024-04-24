public class Main {
    public static void main(String[] args) {
        float wallAttenuation = 10; // variavel y
        float windowAttenuation = 10; // variavel j
        float floorAttenuation = 10; // variavel k
        float numberOfWalls = 0; // variavel n
        float numberOfFloors = 0; // variavel p
        float numberOfWindows = 0;  // variavel l
        float distance = 4; // variavel d
        double transmittedPower5 = 20.27; // variavel t
        double transmittedPower2_4 = 16.94;// variavel a
        float ganhoRecetor = 0; // variavel g
        double ganhoTransmitter5 = 1.7; // variavel b
        double ganhoTransmitter2_4 = 2; // variavel v

        RFreception rf = new RFreception();
        double teste2_4 = rf.e;
        double teste5 = rf.r;
        double powerReceived_5 = rf.calculateInDoorSimulatorFunctionFREQ5(transmittedPower5, ganhoTransmitter5, ganhoRecetor, rf.r, distance, wallAttenuation
                , numberOfWalls, floorAttenuation, numberOfFloors, windowAttenuation, numberOfWindows);

        double powerReceived2_4 = rf.calculateInDoorSimulatorFunctionFREQ2_4(transmittedPower2_4, ganhoTransmitter2_4, ganhoRecetor, rf.e, distance, wallAttenuation
                , numberOfWalls, floorAttenuation, numberOfFloors, windowAttenuation, numberOfWindows);

        System.out.print("\nValor de Lameda com 2.4Ghz: ");
        System.out.println(teste2_4);
        System.out.print("Valor de Lameda com 5Ghz: ");
        System.out.println(teste5);
        System.out.printf("A potencia recebida com frequência 2.4Ghz é: ");
        System.out.println(powerReceived2_4);
        System.out.printf("A potencia recebida com frequência 5Ghz é: ");
        System.out.println(powerReceived_5);
    }
}
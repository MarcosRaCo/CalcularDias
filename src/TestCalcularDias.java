/**
 * PACKAGE_NAME
 * Nombre_project: CalcularDias
 * TestCalcularDias
 * Created by: MarcosRa
 * Date : 17/12/2020
 * Description:
 **/
public class TestCalcularDias {
    public static void main(String[] args) {
        DiesEntreDates_Marcos_Rabadan dias = new DiesEntreDates_Marcos_Rabadan();
        try {
            DataXS fecha1 = new DataXS("24/08/2000");
            DataXS fecha2 = new DataXS("18/12/2020");
            System.out.println(dias.nombreDiesTotals(fecha1, fecha2));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

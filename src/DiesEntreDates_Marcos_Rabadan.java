/**
 * PACKAGE_NAME
 * Nombre_project: CalcularDias
 * DiesEntreDates_Marcos_Rabadan
 * Created by: MarcosRa
 * Date : 17/12/2020
 * Description:
 **/
public class DiesEntreDates_Marcos_Rabadan extends CalcularDiesEntreDates{
    /** Array que contiene los dias de cada mes **/
    private final int[] diasMeses = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};


    @Override
    protected int diesMes(int mes) {
        //Le pasamos un mes como parametro Restamos 1 para cuando sea enero (el primer mes, que ocupa la posicion 0 del array, por eso restamos el 1 )
        return this.diasMeses[mes - 1];
    }

    @Override
    protected int diesMesInicial(DataXS dataXS) {
        //Restamos a los dias(de los meses) el dia que le pasamos por parametro para saber los dias que faltan para acabar el mes inicial
        //Llamamos al metodo anterior
        return this.diesMes(dataXS.mes) - dataXS.dia;
    }
    //Dias que quedan hasta final de mes
    @Override
    protected int diesMesDesti(DataXS dataXS) {
        return dataXS.dia;
    }
    //Dias que quedan hasta final de año
    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        int resto = this.diesMesInicial(datainicial);
        for (int i = datainicial.mes; i < 12; i++) {
            resto = resto + this.diasMeses[i];
        }
        return resto - this.diesMesInicial(datainicial);
    }
    //Dias que quedan hasta principio de año
    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        int resto = this.diesMesDesti(datadesti);
        for (int i = 0; i < datadesti.mes - 1; i++) {
            resto += diasMeses[i];
        }
        return resto - this.diesMesDesti(datadesti);
    }
    //Devolvera dias entre la primera fecha y la segunda
    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        int diesAnyComplets = 0;
        for (int i = datainicial.any + 1; i < datainicial.any + (datadesti.any - datainicial.any); i++){
            if (!anyDeTraspas(i)) diesAnyComplets += 365;
        }
        return diesAnyComplets;
    }
    //Para sumar 1 cuando el año sea bisiesto
    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        int diesAnysDeTraspas = 0;
        for (int i = datainicial.any + 1; i < datainicial.any + (datadesti.any - datainicial.any); i++){
            if (anyDeTraspas(i)) diesAnysDeTraspas += 366;
        }
        return diesAnysDeTraspas;
    }
    //Bisiestos
    @Override
    protected boolean anyDeTraspas(int any) {
        this.diasMeses[1] = 29;
        return (any % 400 == 0) || ((any % 4 == 0) && !(any % 100 == 0));
    }
}

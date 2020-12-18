/**
 * PACKAGE_NAME
 * Nombre_project: CalcularDias
 * DiesEntreDates_Marcos_Rabadan
 * Created by: MarcosRa
 * Date : 17/12/2020
 * Description:
 **/
public class DiesEntreDates_Marcos_Rabadan extends CalcularDiesEntreDates{

    @Override
    protected int diesMes(int mes) {
        return 0;
    }

    @Override
    protected int diesMesInicial(DataXS dataXS) {
        return 0;
    }

    @Override
    protected int diesMesDesti(DataXS dataXS) {
        return 0;
    }

    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        return 0;
    }

    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        return 0;
    }

    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        return 0;
    }

    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        return 0;
    }

    @Override
    protected boolean anyDeTraspas(int any) {
        return false;
    }
}

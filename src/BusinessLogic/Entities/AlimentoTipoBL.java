package BusinessLogic.Entities;

import DataAccess.DAOs.AlimentoTipoDAO;
import Infrastructure.AppException;
public class AlimentoTipoBL {
        public AlimentoTipoDAO atDAO = null;

    public AlimentoTipoBL() throws AppException {
        atDAO = new AlimentoTipoDAO();
    }


}

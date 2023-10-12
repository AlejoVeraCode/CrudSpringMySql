package service.impl;

import dao.ClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.ICliente;
@Service
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional
    public model.entity.Cliente save(model.entity.Cliente cliente){
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public model.entity.Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete (model.entity.Cliente cliente) {
       clienteDao.delete(cliente);
    }
}

package org.federica;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CustomerTableModel extends AbstractTableModel {



    private enum customerTableColumns{
        ID("ID"),
        PRIMER_NOMBRE("Primer Nombre"),
        SEGUNDO_NOMBRE("Segundo Nombre"),
        PRIMER_APELLIDO("Primer Apellido"),
        SEGUNDO_APELLIDO("Segundo Apellido"),
        SEXO("Sexo"),
        DIRECCION("Direccion"),
        TELEFONO("Telefono");

        final String header;
        customerTableColumns(String header) {
            this.header = header;
        }
    }

    private List<Customer> customers;

    public CustomerTableModel(List<Customer> customers) {
        super();
        this.customers = customers;
    }

    @Override
    public int getRowCount() {
        return customers.size();
    }

    @Override
    public String getColumnName(int column) {
        return customerTableColumns.values()[column].header;
    }

    @Override
    public int getColumnCount() {
        return customerTableColumns.values().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Customer customer = customers.get(rowIndex);
      switch (customerTableColumns.values()[columnIndex]){
          case ID:
              return customer.getId();
          case PRIMER_NOMBRE:
              return customer.getPrimerNombre();
          case SEGUNDO_NOMBRE:
              return customer.getSegundoNombre();
          case PRIMER_APELLIDO:
              return customer.getPrimerApellido();
          case SEGUNDO_APELLIDO:
              return customer.getSegundoApellido();
          case SEXO:
              return customer.getSexo();
          case DIRECCION:
              return customer.getDireccion();
          case TELEFONO:
              return customer.getTelefono();
          default:
              throw new RuntimeException("No existe el cliente");
      }
    }
    public void add(Customer customer){
        customers.add(customer);
    }
    public boolean delete(int selectedRow){
        if (selectedRow >= customers.size()){
            return false;
        }else {
            customers.remove(selectedRow);
            return true;
        }
    }


}

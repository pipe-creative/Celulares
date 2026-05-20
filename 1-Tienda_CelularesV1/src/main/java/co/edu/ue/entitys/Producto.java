package co.edu.ue.entitys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pro_id")
	private int proId;

	@Column(name="pro_distribuidor")
	private String proDistribuidor;

	@Column(name="pro_marca")
	private String proMarca;

	@Column(name="pro_modelo")
	private String proModelo;

	@Column(name="pro_precio")
	private String proPrecio;

	@Column(name="pro_proveedor")
	private String proProveedor;

	public Producto() {
	}

	public int getProId() {
		return this.proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProDistribuidor() {
		return this.proDistribuidor;
	}

	public void setProDistribuidor(String proDistribuidor) {
		this.proDistribuidor = proDistribuidor;
	}

	public String getProMarca() {
		return this.proMarca;
	}

	public void setProMarca(String proMarca) {
		this.proMarca = proMarca;
	}

	public String getProModelo() {
		return this.proModelo;
	}

	public void setProModelo(String proModelo) {
		this.proModelo = proModelo;
	}

	public String getProPrecio() {
		return this.proPrecio;
	}

	public void setProPrecio(String proPrecio) {
		this.proPrecio = proPrecio;
	}

	public String getProProveedor() {
		return this.proProveedor;
	}

	public void setProProveedor(String proProveedor) {
		this.proProveedor = proProveedor;
	}

}
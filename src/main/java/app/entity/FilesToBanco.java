package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiByteHeaderSignature;


/**
 * Classe que representa a tabela FILESTOBANCO
 * @generated
 */
@Entity
@Table(name = "\"FILESTOBANCO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.FilesToBanco")
public class FilesToBanco implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "imgdb_01", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] imgdb_01;

  /**
  * @generated
  */
  @Column(name = "imgdb_02", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] imgdb_02;

  /**
  * @generated
  */
  @Column(name = "imgdb_03", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] imgdb_03;

  /**
  * @generated
  */
  @Column(name = "imgdb_04", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] imgdb_04;

  /**
  * @generated
  */
  @Column(name = "imgdb_05", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] imgdb_05;

  /**
  * @generated
  */
  @Column(name = "videoDB", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] videoDB;

  /**
   * Construtor
   * @generated
   */
  public FilesToBanco(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public FilesToBanco setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém imgdb_01
   * return imgdb_01
   * @generated
   */
  
  public byte[] getImgdb_01(){
    return this.imgdb_01;
  }

  /**
   * Define imgdb_01
   * @param imgdb_01 imgdb_01
   * @generated
   */
  public FilesToBanco setImgdb_01(byte[] imgdb_01){
    this.imgdb_01 = imgdb_01;
    return this;
  }

  /**
   * Obtém imgdb_02
   * return imgdb_02
   * @generated
   */
  
  public byte[] getImgdb_02(){
    return this.imgdb_02;
  }

  /**
   * Define imgdb_02
   * @param imgdb_02 imgdb_02
   * @generated
   */
  public FilesToBanco setImgdb_02(byte[] imgdb_02){
    this.imgdb_02 = imgdb_02;
    return this;
  }

  /**
   * Obtém imgdb_03
   * return imgdb_03
   * @generated
   */
  
  public byte[] getImgdb_03(){
    return this.imgdb_03;
  }

  /**
   * Define imgdb_03
   * @param imgdb_03 imgdb_03
   * @generated
   */
  public FilesToBanco setImgdb_03(byte[] imgdb_03){
    this.imgdb_03 = imgdb_03;
    return this;
  }

  /**
   * Obtém imgdb_04
   * return imgdb_04
   * @generated
   */
  
  public byte[] getImgdb_04(){
    return this.imgdb_04;
  }

  /**
   * Define imgdb_04
   * @param imgdb_04 imgdb_04
   * @generated
   */
  public FilesToBanco setImgdb_04(byte[] imgdb_04){
    this.imgdb_04 = imgdb_04;
    return this;
  }

  /**
   * Obtém imgdb_05
   * return imgdb_05
   * @generated
   */
  
  public byte[] getImgdb_05(){
    return this.imgdb_05;
  }

  /**
   * Define imgdb_05
   * @param imgdb_05 imgdb_05
   * @generated
   */
  public FilesToBanco setImgdb_05(byte[] imgdb_05){
    this.imgdb_05 = imgdb_05;
    return this;
  }

  /**
   * Obtém videoDB
   * return videoDB
   * @generated
   */
  
  public byte[] getVideoDB(){
    return this.videoDB;
  }

  /**
   * Define videoDB
   * @param videoDB videoDB
   * @generated
   */
  public FilesToBanco setVideoDB(byte[] videoDB){
    this.videoDB = videoDB;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    FilesToBanco object = (FilesToBanco)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}

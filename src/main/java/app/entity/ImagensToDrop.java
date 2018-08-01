package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela IMAGENSTODROP
 * @generated
 */
@Entity
@Table(name = "\"IMAGENSTODROP\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ImagensToDrop")
public class ImagensToDrop implements Serializable {

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
  @Column(name = "imagem_01", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAHN54iDCHcXaPXixxLNCgnvaau93QxUN_s1lq9jz946s7")
  
  private java.lang.String imagem_01;

  /**
  * @generated
  */
  @Column(name = "imagem_02", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAHN54iDCHcXaPXixxLNCgnvaau93QxUN_s1lq9jz946s7")
  
  private java.lang.String imagem_02;

  /**
  * @generated
  */
  @Column(name = "imagem_03", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAHN54iDCHcXaPXixxLNCgnvaau93QxUN_s1lq9jz946s7")
  
  private java.lang.String imagem_03;

  /**
  * @generated
  */
  @Column(name = "imagem_04", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAHN54iDCHcXaPXixxLNCgnvaau93QxUN_s1lq9jz946s7")
  
  private java.lang.String imagem_04;

  /**
  * @generated
  */
  @Column(name = "imagem_05", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAHN54iDCHcXaPXixxLNCgnvaau93QxUN_s1lq9jz946s7")
  
  private java.lang.String imagem_05;

  /**
  * @generated
  */
  @Column(name = "video_01", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAHN54iDCHcXaPXixxLNCgnvaau93QxUN_s1lq9jz946s7")
  
  private java.lang.String video_01;

  /**
   * Construtor
   * @generated
   */
  public ImagensToDrop(){
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
  public ImagensToDrop setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém imagem_01
   * return imagem_01
   * @generated
   */
  
  public java.lang.String getImagem_01(){
    return this.imagem_01;
  }

  /**
   * Define imagem_01
   * @param imagem_01 imagem_01
   * @generated
   */
  public ImagensToDrop setImagem_01(java.lang.String imagem_01){
    this.imagem_01 = imagem_01;
    return this;
  }

  /**
   * Obtém imagem_02
   * return imagem_02
   * @generated
   */
  
  public java.lang.String getImagem_02(){
    return this.imagem_02;
  }

  /**
   * Define imagem_02
   * @param imagem_02 imagem_02
   * @generated
   */
  public ImagensToDrop setImagem_02(java.lang.String imagem_02){
    this.imagem_02 = imagem_02;
    return this;
  }

  /**
   * Obtém imagem_03
   * return imagem_03
   * @generated
   */
  
  public java.lang.String getImagem_03(){
    return this.imagem_03;
  }

  /**
   * Define imagem_03
   * @param imagem_03 imagem_03
   * @generated
   */
  public ImagensToDrop setImagem_03(java.lang.String imagem_03){
    this.imagem_03 = imagem_03;
    return this;
  }

  /**
   * Obtém imagem_04
   * return imagem_04
   * @generated
   */
  
  public java.lang.String getImagem_04(){
    return this.imagem_04;
  }

  /**
   * Define imagem_04
   * @param imagem_04 imagem_04
   * @generated
   */
  public ImagensToDrop setImagem_04(java.lang.String imagem_04){
    this.imagem_04 = imagem_04;
    return this;
  }

  /**
   * Obtém imagem_05
   * return imagem_05
   * @generated
   */
  
  public java.lang.String getImagem_05(){
    return this.imagem_05;
  }

  /**
   * Define imagem_05
   * @param imagem_05 imagem_05
   * @generated
   */
  public ImagensToDrop setImagem_05(java.lang.String imagem_05){
    this.imagem_05 = imagem_05;
    return this;
  }

  /**
   * Obtém video_01
   * return video_01
   * @generated
   */
  
  public java.lang.String getVideo_01(){
    return this.video_01;
  }

  /**
   * Define video_01
   * @param video_01 video_01
   * @generated
   */
  public ImagensToDrop setVideo_01(java.lang.String video_01){
    this.video_01 = video_01;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ImagensToDrop object = (ImagensToDrop)obj;
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

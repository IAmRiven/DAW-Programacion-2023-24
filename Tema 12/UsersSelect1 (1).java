/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.mavenproject2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author usuario
 */
public class UsersSelect1 {
    //public static void main(String[] args) {
    public static List<Marks> recuperarNotas(String username){
    List<Marks> userMarks=new ArrayList<>();
    EntityManager em = EntityManagerUtil.getEntityManager();
    try{
        //busca el objeto por clave primaria
        Users user = em.find(Users.class, username);
        em.close();
        
        userMarks = user.getMarks();

    }catch(Exception e){
        e.printStackTrace();
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
         }
    }finally{
    }
    return userMarks;
    }
    public static List<Users> recuperarUsuarios() {
        
  
        EntityManager em = EntityManagerUtil.getEntityManager();
        List<Users> usuarios=new ArrayList<>();
             try {
            // Iniciar una transacción
            em.getTransaction().begin();

            // Crear una consulta JPQL para recuperar todos los registros de MiEntidad
            //Jakarta Persistence QL
            TypedQuery<Users> query = em.createQuery("SELECT u FROM Users u", Users.class);
            usuarios = query.getResultList();
            

            // Finalizar la transacción
            em.getTransaction().commit();
     
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close(); 
        }

       return usuarios;


    }   
}


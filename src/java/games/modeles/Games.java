/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.modeles;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Divz
 */
@Entity
public class Games implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    /**
     * nom du jeu
     */
    private String nom;

    /**
     * le jeu est-il jouable actuellement
     */
    private boolean isPlayable;

    /**
     * libelle du jeu : action/stratégie/shooter...
     */
    private String libelle;

    /**
     * Get the value of isPlayable
     *
     * @return the value of isPlayable
     */
    public boolean isIsPlayable()
    {
	return isPlayable;
    }

    /**
     * Set the value of isPlayable
     *
     * @param isPlayable new value of isPlayable
     */
    public void setIsPlayable(boolean isPlayable)
    {
	this.isPlayable = isPlayable;
    }

    /**
     * Get the value of nom
     *
     * @return the value of nom
     */
    public String getNom()
    {
	return nom;
    }

    /**
     * Set the value of nom
     *
     * @param nom new value of nom
     */
    public void setNom(String nom)
    {
	this.nom = nom;
    }

    /**
     * Get the value of libelle
     *
     * @return the value of libelle
     */
    public String getLibelle()
    {
	return libelle;
    }

    /**
     * Set the value of libelle
     *
     * @param libelle new value of libelle
     */
    public void setLibelle(String libelle)
    {
	this.libelle = libelle;
    }

    public Games()
    {
    }

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    @Override
    public int hashCode()
    {
	int hash = 0;
	hash += (int) id;
	return hash;
    }

    @Override
    public boolean equals(Object object)
    {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof Games))
	{
	    return false;
	}
	Games other = (Games) object;
	if (this.id != other.id)
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "games.modeles.Games[ id=" + id + " ]";
    }

}

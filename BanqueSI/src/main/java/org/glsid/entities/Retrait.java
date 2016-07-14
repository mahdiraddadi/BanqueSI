package org.glsid.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

@Entity
@DiscriminatorValue("R")
@XmlType(name="R")
public class Retrait extends Operation {

}

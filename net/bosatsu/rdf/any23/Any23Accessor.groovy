package net.bosatsu.rdf.any23

import org.netkernel.module.standard.endpoint.StandardAccessorImpl
import org.netkernel.rdf.jena.rep.JenaModelRepresentation

import com.hp.hpl.jena.rdf.model.ModelFactory

class Any23Accessor extends StandardAccessorImpl
{ 
  Any23Accessor() { 
    this.declareThreadSafe()
    this.declareSourceRepresentation(JenaModelRepresentation.class)
  }

  void onSource(context) { 
    def m = ModelFactory.createDefaultModel()
    context.createResponseFrom(new JenaModelRepresentation(m))
  }
}
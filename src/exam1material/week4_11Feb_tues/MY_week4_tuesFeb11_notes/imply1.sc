// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

@pure def implication1(p: B, q: B, r: B): Unit = {
  Deduce(
    (p & q __>: r,  p __>: q,  p)  ⊢  r
      Proof(
      1  (  p & q __>: r  ) by Premise,
      2  (  p __>: q      ) by Premise,
      3  (  p          ) by Premise,

      
    )
  )
}
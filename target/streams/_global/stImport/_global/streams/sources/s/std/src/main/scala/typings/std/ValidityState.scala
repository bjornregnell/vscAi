package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState)
  */
trait ValidityState extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/badInput) */
  /* standard dom */
  val badInput: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/customError) */
  /* standard dom */
  val customError: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/patternMismatch) */
  /* standard dom */
  val patternMismatch: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeOverflow) */
  /* standard dom */
  val rangeOverflow: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeUnderflow) */
  /* standard dom */
  val rangeUnderflow: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/stepMismatch) */
  /* standard dom */
  val stepMismatch: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooLong) */
  /* standard dom */
  val tooLong: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooShort) */
  /* standard dom */
  val tooShort: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/typeMismatch) */
  /* standard dom */
  val typeMismatch: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/valid) */
  /* standard dom */
  val valid: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/valueMissing) */
  /* standard dom */
  val valueMissing: scala.Boolean
}
object ValidityState {
  
  inline def apply(
    badInput: scala.Boolean,
    customError: scala.Boolean,
    patternMismatch: scala.Boolean,
    rangeOverflow: scala.Boolean,
    rangeUnderflow: scala.Boolean,
    stepMismatch: scala.Boolean,
    tooLong: scala.Boolean,
    tooShort: scala.Boolean,
    typeMismatch: scala.Boolean,
    valid: scala.Boolean,
    valueMissing: scala.Boolean
  ): ValidityState = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], customError = customError.asInstanceOf[js.Any], patternMismatch = patternMismatch.asInstanceOf[js.Any], rangeOverflow = rangeOverflow.asInstanceOf[js.Any], rangeUnderflow = rangeUnderflow.asInstanceOf[js.Any], stepMismatch = stepMismatch.asInstanceOf[js.Any], tooLong = tooLong.asInstanceOf[js.Any], tooShort = tooShort.asInstanceOf[js.Any], typeMismatch = typeMismatch.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], valueMissing = valueMissing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidityState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidityState] (val x: Self) extends AnyVal {
    
    inline def setBadInput(value: scala.Boolean): Self = StObject.set(x, "badInput", value.asInstanceOf[js.Any])
    
    inline def setCustomError(value: scala.Boolean): Self = StObject.set(x, "customError", value.asInstanceOf[js.Any])
    
    inline def setPatternMismatch(value: scala.Boolean): Self = StObject.set(x, "patternMismatch", value.asInstanceOf[js.Any])
    
    inline def setRangeOverflow(value: scala.Boolean): Self = StObject.set(x, "rangeOverflow", value.asInstanceOf[js.Any])
    
    inline def setRangeUnderflow(value: scala.Boolean): Self = StObject.set(x, "rangeUnderflow", value.asInstanceOf[js.Any])
    
    inline def setStepMismatch(value: scala.Boolean): Self = StObject.set(x, "stepMismatch", value.asInstanceOf[js.Any])
    
    inline def setTooLong(value: scala.Boolean): Self = StObject.set(x, "tooLong", value.asInstanceOf[js.Any])
    
    inline def setTooShort(value: scala.Boolean): Self = StObject.set(x, "tooShort", value.asInstanceOf[js.Any])
    
    inline def setTypeMismatch(value: scala.Boolean): Self = StObject.set(x, "typeMismatch", value.asInstanceOf[js.Any])
    
    inline def setValid(value: scala.Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValueMissing(value: scala.Boolean): Self = StObject.set(x, "valueMissing", value.asInstanceOf[js.Any])
  }
}

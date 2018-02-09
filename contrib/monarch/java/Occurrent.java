import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Occurrent
 * <p>
 * A processual entity
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Occurrent {


    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Occurrent) == false) {
            return false;
        }
        Occurrent rhs = ((Occurrent) other);
        return new EqualsBuilder().isEquals();
    }

}

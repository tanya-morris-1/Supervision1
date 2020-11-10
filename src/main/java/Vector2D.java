public class Vector2D {
    float x;
    float y;


    public Vector2D(float a, float b){
        x = a;                              // Initialises the x and y variables with the floats inputted.
        y = b;
    }

    Vector2D add_other(Vector2D a){         // Takes another vector to add.
        Vector2D result = new Vector2D(0.0F, 0.0F);         // Creates a new vector to put the results in and return.
        result.x = this.x + a.x;            // Adds x components, then does the same for y.
        result.y = this.y + a.y;
        return result;
    }

    float scalar_product(Vector2D a){
        float result = (this.x*a.x)+(this.y*a.y);       // Multiplies and adds x and y components.
        return result;                                  // Returns float.
    }

    void normalise(){
    double size = magnitude();
        this.x = (float) (this.x/size);         // Casts result to float (casts at this stage to avoid losing more accuracy
                                                // at earlier stages)
        this.y = (float) (this.y/size);
    }

    double magnitude(){                             // Finds magnitude as a double (as this is what sqrt returns).
        double size = Math.sqrt(x*x + y*y);
        return size;
    }
}


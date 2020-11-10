
import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class Vector2DTest {

    @Test
    public void creates_vector(){
        //ARRANGE
        Vector2D a = new Vector2D(2.0F, 4.0F);

        //ACT
        float x = a.x;
        float y = a.y;

        //ASSERT
        assertThat(x).isWithin((float) 1E-7).of(2.0F);
        assertThat(y).isWithin((float) 1E-7).of(4.0F);
    }

    @Test
    public void adds_vector(){
        //ARRANGE
        Vector2D a = new Vector2D(2.0F, 4.0F);
        Vector2D b = new Vector2D(8.0F, 4.0F);

        //ACT
        Vector2D c = a.add_other(b);
        float x = c.x;
        float y = c.y;

        //ASSERT
        assertThat(x).isWithin((float) 1E-7).of(10.0F);
        assertThat(y).isWithin((float) 1E-7).of(8.0F);
    }

    @Test
    public void scalar_product_works(){
        //ARRANGE
        Vector2D a = new Vector2D(2.0F, 4.0F);
        Vector2D b = new Vector2D(8.0F, 4.0F);

        //ACT
        float x = a.scalar_product(b);

        //ASSERT
        assertThat(x).isWithin((float) 1E-7).of(32.0F);
    }

    @Test
    public void normalises(){
        //ARRANGE
        Vector2D a = new Vector2D(2.0F, 4.0F);

        //ACT
        a.normalise();
        float x = a.x;
        float y = a.y;

        //ASSERT
        assertThat(x).isWithin((float) 1E-7).of(0.4472135955F);
        assertThat(y).isWithin((float) 1E-7).of(0.894427191F);
    }

}

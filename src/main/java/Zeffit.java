public class Zeffit
{
    private static int HITS_TAKEN;

    /**
     * Constructor for objects of class Zeffit
     */
    public Zeffit()
    {
        // TODO: initialize instance variable(s)
        HITS_TAKEN = 0;
    }

    /**
     * Inflicts or registers a hit on this Zeffit.
     *
     */
    public void takesHit()
    {
        HITS_TAKEN += 1;
    }

    /**
     * Indicates whether this Zeffit has taken no hits
     *
     * @return    true if this Zeffit has taken no hits; false otherwise.
     */
    public boolean isHitFree()
    {
        if (HITS_TAKEN == 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Indicates whether this Zeffit has taken a hit
     *
     * @return    true if this Zeffit has taken a hit; false otherwise.
     */
    public boolean isGreen()
    {
        if (HITS_TAKEN == 1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Indicates whether this Zeffit has taken two hits
     *
     * @return    true if this Zeffit has taken two hits; false otherwise.
     */
    public boolean isBlue()
    {
        if (HITS_TAKEN == 2){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Indicates whether this Zeffit has taken three hits
     *
     * @return    true if this Zeffit has taken three hits; false otherwise.
     */
    public boolean isRed()
    {
        if (HITS_TAKEN == 3){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Indicates whether this Zeffit has exploded in a fiery death!
     *
     * @return    true if this Zeffit is dead; false otherwise.
     */
    public boolean isDead()
    {
        if (HITS_TAKEN == 4){
            return true;
        }else {
            return false;
        }
    }
}


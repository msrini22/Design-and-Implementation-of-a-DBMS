package global;

public interface GlobalConst {

  public static final int MINIBASE_MAXARRSIZE = 50;
  public static final int NUMBUF = 10000;

  /** Size of page. */
  public static final int MINIBASE_PAGESIZE = 16048;           // in bytes

  /** Size of each frame. */
  public static final int MINIBASE_BUFFER_POOL_SIZE = 16048;   // in Frames

  public static final int MAX_SPACE = 16048;   // in Frames
  
  public static final int COMPOSITE_KEY_LEN = 19;
  public static final int INTERVAL_LEN = 12;
  public static final int STR_LEN = 5;

  /**
   * in Pages => the DBMS Manager tells the DB how much disk 
   * space is available for the database.
   */
  public static final int MINIBASE_DB_SIZE = 10000;
  public static final int MINIBASE_MAX_TRANSACTIONS = 100;
  public static final int MINIBASE_DEFAULT_SHAREDMEM_SIZE = 1000;

  /**
   * also the name of a relation
   */
  public static final int MAXFILENAME  = 15;
  public static final int MAXINDEXNAME = 40;
  public static final int MAXATTRNAME  = 15;
  public static final int MAX_NAME = 50;

  public static final int INVALID_PAGE = -1;
  public static final int XML_PLAIN_TXT_CHAR_LMT = 5;
  public static final int INTRVL_MAX_START_VAL = 500000;
  public static final int INTRVL_MAX_END_VAL = 500000;
  public static final int INTRVL_MIN_START_VAL = -500000;
  public static final int INTRVL_MIN_END_VAL = -500000;
  public static final int INTRVL_MAX_LEVEL_VAL = 500000;
  public static final int INTRVL_MIN_LEVEL_VAL = -500000;
}

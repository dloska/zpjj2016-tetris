package tetris.model;

/**
 * Created by Damian Deska on 2016-07-04.
 */
public interface BlockFactory {
    Block makeBlock(BlockType blockType);
}

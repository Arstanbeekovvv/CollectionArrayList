package HomeWorkLMS.MethodsAndModels;

import HomeWorkLMS.Models.Reader;
import java.util.List;

public interface ReaderService {
    void saveReader(Reader reader);

    void getAllReaders();

    Reader getReaderById(Long id);

    void updateReader(Long id, Reader reader);

    void assignReaderToLibrary(Long readerId,Long libraryId);
}

package ge.edu.tsu.hcrs.control_panel.service.normalizeddata;

import ge.edu.tsu.hcrs.control_panel.model.network.normalizeddata.GroupedNormalizedData;
import ge.edu.tsu.hcrs.control_panel.model.network.normalizeddata.NormalizedData;

import java.util.List;

public interface NormalizedDataService {

    void addNormalizedDatum(List<NormalizedData> normalizedDatum, int groupedNormalizedDataId);

    List<NormalizedData> getNormalizedDatum(List<GroupedNormalizedData> groupedNormalizedDatum);
}

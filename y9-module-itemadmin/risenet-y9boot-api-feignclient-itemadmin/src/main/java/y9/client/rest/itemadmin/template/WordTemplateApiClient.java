package y9.client.rest.itemadmin.template;

import org.springframework.cloud.openfeign.FeignClient;

import net.risesoft.api.itemadmin.template.WordTemplateApi;

/**
 * @author qinman
 * @author zhangchongjie
 * @date 2022/12/19
 */
@FeignClient(contextId = "WordTemplateApiClient", name = "${y9.service.itemAdmin.name:itemAdmin}",
    url = "${y9.service.itemAdmin.directUrl:}",
    path = "/${y9.service.itemAdmin.name:server-itemadmin}/services/rest/wordTemplate")
public interface WordTemplateApiClient extends WordTemplateApi {

}

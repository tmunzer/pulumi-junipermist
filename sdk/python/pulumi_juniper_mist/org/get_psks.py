# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetPsksResult',
    'AwaitableGetPsksResult',
    'get_psks',
    'get_psks_output',
]

@pulumi.output_type
class GetPsksResult:
    """
    A collection of values returned by getPsks.
    """
    def __init__(__self__, id=None, limit=None, name=None, org_id=None, org_psks=None, page=None, role=None, ssid=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if limit and not isinstance(limit, int):
            raise TypeError("Expected argument 'limit' to be a int")
        pulumi.set(__self__, "limit", limit)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_psks and not isinstance(org_psks, list):
            raise TypeError("Expected argument 'org_psks' to be a list")
        pulumi.set(__self__, "org_psks", org_psks)
        if page and not isinstance(page, int):
            raise TypeError("Expected argument 'page' to be a int")
        pulumi.set(__self__, "page", page)
        if role and not isinstance(role, str):
            raise TypeError("Expected argument 'role' to be a str")
        pulumi.set(__self__, "role", role)
        if ssid and not isinstance(ssid, str):
            raise TypeError("Expected argument 'ssid' to be a str")
        pulumi.set(__self__, "ssid", ssid)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def limit(self) -> Optional[int]:
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="orgPsks")
    def org_psks(self) -> Sequence['outputs.GetPsksOrgPskResult']:
        return pulumi.get(self, "org_psks")

    @property
    @pulumi.getter
    def page(self) -> Optional[int]:
        return pulumi.get(self, "page")

    @property
    @pulumi.getter
    def role(self) -> Optional[str]:
        return pulumi.get(self, "role")

    @property
    @pulumi.getter
    def ssid(self) -> Optional[str]:
        return pulumi.get(self, "ssid")


class AwaitableGetPsksResult(GetPsksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPsksResult(
            id=self.id,
            limit=self.limit,
            name=self.name,
            org_id=self.org_id,
            org_psks=self.org_psks,
            page=self.page,
            role=self.role,
            ssid=self.ssid)


def get_psks(limit: Optional[int] = None,
             name: Optional[str] = None,
             org_id: Optional[str] = None,
             page: Optional[int] = None,
             role: Optional[str] = None,
             ssid: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPsksResult:
    """
    This data source provides the list of WAN Assurance Psks.The Psks are used in the `service_policies` from the Gateway configuration and Gateway templates

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    psks_vip = junipermist.org.get_psks(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550",
        role="vip")
    ```
    """
    __args__ = dict()
    __args__['limit'] = limit
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['page'] = page
    __args__['role'] = role
    __args__['ssid'] = ssid
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getPsks:getPsks', __args__, opts=opts, typ=GetPsksResult).value

    return AwaitableGetPsksResult(
        id=pulumi.get(__ret__, 'id'),
        limit=pulumi.get(__ret__, 'limit'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_psks=pulumi.get(__ret__, 'org_psks'),
        page=pulumi.get(__ret__, 'page'),
        role=pulumi.get(__ret__, 'role'),
        ssid=pulumi.get(__ret__, 'ssid'))


@_utilities.lift_output_func(get_psks)
def get_psks_output(limit: Optional[pulumi.Input[Optional[int]]] = None,
                    name: Optional[pulumi.Input[Optional[str]]] = None,
                    org_id: Optional[pulumi.Input[str]] = None,
                    page: Optional[pulumi.Input[Optional[int]]] = None,
                    role: Optional[pulumi.Input[Optional[str]]] = None,
                    ssid: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPsksResult]:
    """
    This data source provides the list of WAN Assurance Psks.The Psks are used in the `service_policies` from the Gateway configuration and Gateway templates

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    psks_vip = junipermist.org.get_psks(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550",
        role="vip")
    ```
    """
    ...

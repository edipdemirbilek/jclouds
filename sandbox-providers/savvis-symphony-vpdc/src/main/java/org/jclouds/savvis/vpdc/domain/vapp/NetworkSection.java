package org.jclouds.savvis.vpdc.domain.vapp;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

/**
 * The NetworkSection element shall list all logical networks used in the OVF package.
 * 
 * @author Adrian Cole
 */
public class NetworkSection {
   private final String info;
   private final Set<Network> networks;

   public NetworkSection(String info, Iterable<Network> networks) {
      this.info = info;
      this.networks = ImmutableSet.<Network> copyOf(networks);
   }

   public String getInfo() {
      return info;
   }

   /**
    * All networks referred to from Connection elements in all {@link VirtualHardwareSection}
    * elements shall be defined in the NetworkSection.
    * 
    * @return
    */
   public Set<Network> getNetworks() {
      return networks;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((info == null) ? 0 : info.hashCode());
      result = prime * result + ((networks == null) ? 0 : networks.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      NetworkSection other = (NetworkSection) obj;
      if (info == null) {
         if (other.info != null)
            return false;
      } else if (!info.equals(other.info))
         return false;
      if (networks == null) {
         if (other.networks != null)
            return false;
      } else if (!networks.equals(other.networks))
         return false;
      return true;
   }

   @Override
   public String toString() {
      return "[info=" + info + ", networks=" + networks + "]";
   }

}
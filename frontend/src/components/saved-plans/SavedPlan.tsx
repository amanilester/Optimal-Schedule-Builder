"use client";
import { Button } from "@/components/ui/Button";
import { type WeekSchedule as WeekScheduleType } from "@/types/scheduleTypes";
import WeekSchedule from "@/components/schedules/WeekSchedule";
import { useState, useEffect } from "react";
import { PiNotePencil } from "react-icons/pi";
import { PiHeart } from "react-icons/pi";
import { PiArrowsOut } from "react-icons/pi";
import Image from "next/image";
import Link from "next/Link";

interface PlanDisplayProps {
  index?: number;
  planTitle: string;
  plan: WeekScheduleType;
}

export default function SavedPlan({
  planTitle,
  plan,
}: PlanDisplayProps) {

  return (
    <div className="relative">
      <div className="flex flex-row items-center m-5 w-[70vw] h-24 rounded-xl bg-glory-glory-red">
      </div>
      {/* Saved plan container */}
      <div className="absolute top-0 flex flex-row items-center m-5 w-[70vw] h-20 z-10 rounded-xl border-2 border-black bg-white">
        {/* Paw icon */}
        <Image
          src="/images/blackpaw.svg"
          width={50}
          height={50}
          className="m-4"
          alt="black paw"
        />
        {/* Plan title */}
        <h1 className="text-4xl"> 
          {planTitle} 
        </h1>
        {/* Buttons container */}
        <div className="flex items-center justify-end ml-auto">
          {/* Save button */}
          <PiHeart
              size={60}
              className="m-2 fill-black transition hover:fill-bulldog-red" 
            />
          {/* Open button (redirects to the schedules page)*/}
          <Link href={`/schedules?title=${encodeURIComponent(planTitle)}&data=${encodeURIComponent(JSON.stringify(plan))}`}>
            <PiArrowsOut
              size={60}
              className="m-2 fill-black transition hover:fill-bulldog-red" 
            />
          </Link>
        </div>
      </div>
    </div>
  );
}

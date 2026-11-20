.class public final synthetic Lxp/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt/o;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/camera/b;

.field public final synthetic b:Lat/a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

.field public final synthetic d:Leo/e;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp/n0;->a:Lcom/withpersona/sdk2/camera/b;

    iput-object p2, p0, Lxp/n0;->b:Lat/a;

    iput-object p3, p0, Lxp/n0;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iput-object p4, p0, Lxp/n0;->d:Leo/e;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lxp/n0;->a:Lcom/withpersona/sdk2/camera/b;

    iget-object v1, p0, Lxp/n0;->b:Lat/a;

    iget-object v2, p0, Lxp/n0;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v3, p0, Lxp/n0;->d:Leo/e;

    move-object v4, p1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    move-object v5, p2

    check-cast v5, Lym/y;

    move-object v6, p3

    check-cast v6, Landroid/content/Context;

    move-object v7, p4

    check-cast v7, Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v7}, Lxp/p0;->b(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

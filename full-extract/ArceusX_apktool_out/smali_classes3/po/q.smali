.class public final synthetic Lpo/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lwm/h;


# direct methods
.method public synthetic constructor <init>(Lwm/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/q;->a:Lwm/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpo/q;->a:Lwm/h;

    invoke-static {v0}, Lpo/m0;->A(Lwm/h;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

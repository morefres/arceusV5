.class public final synthetic Lso/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lwm/k$a;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lso/o;->a:Lwm/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lso/o;->a:Lwm/k$a;

    invoke-static {v0}, Lso/v;->c(Lwm/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

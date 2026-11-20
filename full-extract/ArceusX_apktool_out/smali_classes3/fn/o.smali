.class public final synthetic Lfn/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfn/s;


# direct methods
.method public synthetic constructor <init>(Lfn/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/o;->a:Lfn/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfn/o;->a:Lfn/s;

    invoke-static {v0}, Lfn/s;->a(Lfn/s;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

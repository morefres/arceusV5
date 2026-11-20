.class public final synthetic Lxu/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/c0;

.field public final synthetic b:Lwu/g;

.field public final synthetic c:Lkotlin/jvm/internal/c0;

.field public final synthetic d:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/c0;Lwu/g;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxu/s;->a:Lkotlin/jvm/internal/c0;

    iput-object p2, p0, Lxu/s;->b:Lwu/g;

    iput-object p3, p0, Lxu/s;->c:Lkotlin/jvm/internal/c0;

    iput-object p4, p0, Lxu/s;->d:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lxu/s;->a:Lkotlin/jvm/internal/c0;

    iget-object v1, p0, Lxu/s;->b:Lwu/g;

    iget-object v2, p0, Lxu/s;->c:Lkotlin/jvm/internal/c0;

    iget-object v3, p0, Lxu/s;->d:Lkotlin/jvm/internal/c0;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static/range {v0 .. v6}, Lxu/t;->c(Lkotlin/jvm/internal/c0;Lwu/g;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;IJ)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

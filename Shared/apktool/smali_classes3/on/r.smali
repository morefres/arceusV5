.class public Lon/r;
.super Lon/a;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/Integer;

.field public h:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lon/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lon/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lon/d0;->h(Lon/r;)V

    return-void
.end method

.method public c(Lon/s;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Lon/s;->c(Lon/s;)V

    return-void
.end method

.method public p(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lon/r;->h:Ljava/lang/Integer;

    return-void
.end method

.method public q(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lon/r;->g:Ljava/lang/Integer;

    return-void
.end method
